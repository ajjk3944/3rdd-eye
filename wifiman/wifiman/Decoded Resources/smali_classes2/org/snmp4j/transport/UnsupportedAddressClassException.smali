.class public Lorg/snmp4j/transport/UnsupportedAddressClassException;
.super Lorg/snmp4j/MessageException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0xc0004a9c5f33d7cL


# instance fields
.field private addressClass:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lorg/snmp4j/transport/UnsupportedAddressClassException;->addressClass:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public getAddressClass()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/UnsupportedAddressClassException;->addressClass:Ljava/lang/Class;

    return-object v0
.end method
