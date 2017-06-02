package com.disid.proofs.client.web.api;
import com.disid.proofs.client.domain.Operation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = OperationsItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Operation.class, pathPrefix = "api", type = ControllerType.ITEM)
@RooJSON
public class OperationsItemJsonController {
}
