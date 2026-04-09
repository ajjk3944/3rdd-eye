.class public final synthetic LOc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOc/b;->a:Lkotlin/jvm/internal/N;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, LOc/b;->a:Lkotlin/jvm/internal/N;

    invoke-static {v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->b(Lkotlin/jvm/internal/N;)V

    return-void
.end method
