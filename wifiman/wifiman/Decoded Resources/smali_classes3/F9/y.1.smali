.class public final synthetic LF9/y;
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

    iput-object p1, p0, LF9/y;->a:Lmh/l;

    iput-boolean p2, p0, LF9/y;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF9/y;->a:Lmh/l;

    iget-boolean v1, p0, LF9/y;->b:Z

    invoke-static {v0, v1}, LF9/B;->a(Lmh/l;Z)LYg/J;

    move-result-object v0

    return-object v0
.end method
