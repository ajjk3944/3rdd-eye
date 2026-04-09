.class public final synthetic LEe/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:LEe/f;


# direct methods
.method public synthetic constructor <init>(Lmh/l;LEe/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe/l;->a:Lmh/l;

    iput-object p2, p0, LEe/l;->b:LEe/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LEe/l;->a:Lmh/l;

    iget-object v1, p0, LEe/l;->b:LEe/f;

    invoke-static {v0, v1}, LEe/z;->p(Lmh/l;LEe/f;)LYg/J;

    move-result-object v0

    return-object v0
.end method
