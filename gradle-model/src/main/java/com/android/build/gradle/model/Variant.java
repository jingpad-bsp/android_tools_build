/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.build.gradle.model;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.builder.model.ProductFlavor;

import java.io.File;
import java.util.List;

/**
 * A build Variant
 */
public interface Variant {

    @NonNull
    String getName();

    @NonNull
    String getDisplayName();

    @NonNull
    File getOutputFile();

    boolean isSigned();

    @Nullable
    File getOutputTestFile();

    @NonNull
    String getAssembleTaskName();

    @Nullable
    String getAssembleTestTaskName();

    @NonNull
    String getBuildType();

    @NonNull
    List<String> getProductFlavors();

    @NonNull
    ProductFlavor getMergedFlavor();

    @NonNull
    List<File> getGeneratedSourceFolders();

    @NonNull
    List<File> getGeneratedResourceFolders();

    @Nullable
    List<File> getGeneratedTestSourceFolders();

    @Nullable
    List<File> getGeneratedTestResourceFolders();

    @NonNull
    File getClassesFolder();

    @NonNull
    Dependencies getDependencies();

    @NonNull
    Dependencies getTestDependencies();
}
