/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ResumeProcessesRequest Marshaller
 */

public class ResumeProcessesRequestMarshaller implements Marshaller<Request<ResumeProcessesRequest>, ResumeProcessesRequest> {

    public Request<ResumeProcessesRequest> marshall(ResumeProcessesRequest resumeProcessesRequest) {

        if (resumeProcessesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ResumeProcessesRequest> request = new DefaultRequest<ResumeProcessesRequest>(resumeProcessesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "ResumeProcesses");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (resumeProcessesRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(resumeProcessesRequest.getAutoScalingGroupName()));
        }

        com.amazonaws.internal.SdkInternalList<String> scalingProcessesList = (com.amazonaws.internal.SdkInternalList<String>) resumeProcessesRequest
                .getScalingProcesses();
        if (!scalingProcessesList.isEmpty() || !scalingProcessesList.isAutoConstruct()) {
            int scalingProcessesListIndex = 1;

            for (String scalingProcessesListValue : scalingProcessesList) {
                if (scalingProcessesListValue != null) {
                    request.addParameter("ScalingProcesses.member." + scalingProcessesListIndex, StringUtils.fromString(scalingProcessesListValue));
                }
                scalingProcessesListIndex++;
            }
        }

        return request;
    }

}
