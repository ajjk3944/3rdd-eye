.class public final synthetic Lbf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Lbf/e;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Lbf/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/h;->a:Lmh/l;

    iput-object p2, p0, Lbf/h;->b:Lbf/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lbf/h;->a:Lmh/l;

    iget-object v1, p0, Lbf/h;->b:Lbf/e;

    invoke-static {v0, v1}, Lbf/i$a$a;->a(Lmh/l;Lbf/e;)LYg/J;

    move-result-object v0

    return-object v0
.end method
