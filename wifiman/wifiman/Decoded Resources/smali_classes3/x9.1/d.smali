.class public final synthetic Lx9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lmh/l;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/d;->a:Lmh/l;

    iput-boolean p2, p0, Lx9/d;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx9/d;->a:Lmh/l;

    iget-boolean v1, p0, Lx9/d;->b:Z

    invoke-static {v0, v1}, Lx9/h;->a(Lmh/l;Z)LYg/J;

    move-result-object v0

    return-object v0
.end method
