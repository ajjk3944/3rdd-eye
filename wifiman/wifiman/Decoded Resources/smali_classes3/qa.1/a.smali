.class public final synthetic Lqa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lmh/p;

.field public final synthetic b:Lmh/r;


# direct methods
.method public synthetic constructor <init>(Lmh/p;Lmh/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqa/a;->a:Lmh/p;

    iput-object p2, p0, Lqa/a;->b:Lmh/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqa/a;->a:Lmh/p;

    iget-object v1, p0, Lqa/a;->b:Lmh/r;

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-static {v0, v1, p1, p2}, Lqa/d;->b(Lmh/p;Lmh/r;LC0/U;LY0/b;)LC0/D;

    move-result-object p1

    return-object p1
.end method
