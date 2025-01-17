package org.apache.maven;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */


import org.apache.maven.exception.ExceptionHandler;
import org.apache.maven.exception.ExceptionSummary;
import org.apache.maven.execution.MavenExecutionRequest;
import org.apache.maven.execution.MavenExecutionResult;
import org.codehaus.plexus.DefaultPlexusContainer;

import javax.inject.Inject;
import java.io.File;
import java.util.Collections;

public class MavenTest
    extends AbstractCoreMavenComponentTestCase
{
    @Inject
    private Maven maven;

    @Inject
    private ExceptionHandler exceptionHandler;

    @Override
    protected synchronized void setupContainer()
    {
        super.setupContainer();

        ( (DefaultPlexusContainer) getContainer() ).addPlexusInjector( Collections.emptyList(),
                binder -> binder.requestInjection( this ) );
    }

    protected String getProjectsDirectory()
    {
        return "src/test/projects/lifecycle-executor";
    }

    public void testLifecycleExecutionUsingADefaultLifecyclePhase()
        throws Exception
    {
/*
        File pom = getProject( "project-with-additional-lifecycle-elements" );
        MavenExecutionRequest request = createMavenExecutionRequest( pom );
        MavenExecutionResult result = maven.execute( request );
        if ( result.hasExceptions() )
        {
            ExceptionSummary es = exceptionHandler.handleException( result.getExceptions().get( 0 ) );
            System.out.println( es.getMessage() );
            es.getException().printStackTrace();
            fail( "Maven did not execute correctly." );
        }
*/
    }
}
