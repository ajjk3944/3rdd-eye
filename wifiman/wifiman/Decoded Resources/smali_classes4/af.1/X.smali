.class public final synthetic Laf/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Laf/O;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Laf/O;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/X;->a:Lmh/l;

    iput-object p2, p0, Laf/X;->b:Laf/O;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Laf/X;->a:Lmh/l;

    iget-object v1, p0, Laf/X;->b:Laf/O;

    invoke-static {v0, v1}, Laf/d0;->h(Lmh/l;Laf/O;)LYg/J;

    move-result-object v0

    return-object v0
.end method
