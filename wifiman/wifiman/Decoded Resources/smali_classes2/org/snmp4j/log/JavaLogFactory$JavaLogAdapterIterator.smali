.class public Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/log/JavaLogFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "JavaLogAdapterIterator"
.end annotation


# instance fields
.field private loggerNames:Ljava/util/Enumeration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Enumeration<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/snmp4j/log/JavaLogFactory;


# direct methods
.method protected constructor <init>(Lorg/snmp4j/log/JavaLogFactory;Ljava/util/Enumeration;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Enumeration<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;->this$0:Lorg/snmp4j/log/JavaLogFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;->loggerNames:Ljava/util/Enumeration;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;->loggerNames:Ljava/util/Enumeration;

    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;->loggerNames:Ljava/util/Enumeration;

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    new-instance v1, Lorg/snmp4j/log/JavaLogAdapter;

    invoke-direct {v1, v0}, Lorg/snmp4j/log/JavaLogAdapter;-><init>(Ljava/util/logging/Logger;)V

    return-object v1
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
