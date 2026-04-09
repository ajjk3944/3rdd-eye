.class public final synthetic Laf/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Laf/J;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Laf/J;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/L;->a:Lmh/l;

    iput-object p2, p0, Laf/L;->b:Laf/J;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Laf/L;->a:Lmh/l;

    iget-object v1, p0, Laf/L;->b:Laf/J;

    invoke-static {v0, v1}, Laf/N$a;->a(Lmh/l;Laf/J;)LYg/J;

    move-result-object v0

    return-object v0
.end method
