/**
 * Copyright 2016 Bryan Kelly
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.github.btkelly.gandalf.checker;

import io.github.btkelly.gandalf.models.Alert;
import io.github.btkelly.gandalf.models.AppVersionDetails;
import io.github.btkelly.gandalf.models.Bootstrap;
import io.github.btkelly.gandalf.models.OptionalUpdate;
import io.github.btkelly.gandalf.models.RequiredUpdate;

/**
 * Describes a checker for interpreting a {@link Bootstrap}. This can be custom.
 */
public interface VersionGate {

    boolean showRequiredUpdate(RequiredUpdate requiredUpdate, AppVersionDetails appVersionDetails);
    boolean showOptionalUpdate(OptionalUpdate optionalUpdate, AppVersionDetails appVersionDetails);
    boolean showAlert(Alert alert);

}
