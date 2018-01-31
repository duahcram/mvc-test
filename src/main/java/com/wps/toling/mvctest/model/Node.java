package com.wps.toling.mvctest.model;

import java.util.Objects;

public class Node {

	private String label;
	private boolean active;

	public Node(String label, boolean active) {
		this.label = label;
		this.active = active;
	}

	public String getLabel() {
		return label;
	}

	public boolean isActive() {
		return active;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Node node = (Node) o;
		return active == node.active && Objects.equals(label, node.label);
	}

	@Override
	public int hashCode() {

		return Objects.hash(label, active);
	}

	@Override
	public String toString() {
		return "Node{" + "label='" + label + '\'' + ", active=" + active + '}';
	}
}
