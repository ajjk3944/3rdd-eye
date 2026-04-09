.class public final synthetic Lrd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lrd/j;


# direct methods
.method public synthetic constructor <init>(Lrd/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd/g;->a:Lrd/j;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lrd/g;->a:Lrd/j;

    invoke-static {v0}, Lrd/j;->b(Lrd/j;)V

    return-void
.end method
