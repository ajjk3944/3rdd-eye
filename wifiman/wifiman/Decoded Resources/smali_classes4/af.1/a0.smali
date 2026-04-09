.class public final synthetic Laf/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/a0;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Laf/a0;->a:Lmh/l;

    check-cast p1, Laf/Q;

    invoke-static {v0, p1}, Laf/d0;->g(Lmh/l;Laf/Q;)LYg/J;

    move-result-object p1

    return-object p1
.end method
