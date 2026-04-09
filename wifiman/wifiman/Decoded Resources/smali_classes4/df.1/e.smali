.class public final synthetic Ldf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Ldf/b;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Ldf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/e;->a:Lmh/l;

    iput-object p2, p0, Ldf/e;->b:Ldf/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ldf/e;->a:Lmh/l;

    iget-object v1, p0, Ldf/e;->b:Ldf/b;

    invoke-static {v0, v1}, Ldf/h;->a(Lmh/l;Ldf/b;)LYg/J;

    move-result-object v0

    return-object v0
.end method
