.class public final synthetic LJ9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:LT/z1;

.field public final synthetic c:LT/z1;


# direct methods
.method public synthetic constructor <init>(FLT/z1;LT/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LJ9/e;->a:F

    iput-object p2, p0, LJ9/e;->b:LT/z1;

    iput-object p3, p0, LJ9/e;->c:LT/z1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LJ9/e;->a:F

    iget-object v1, p0, LJ9/e;->b:LT/z1;

    iget-object v2, p0, LJ9/e;->c:LT/z1;

    check-cast p1, Lo0/f;

    invoke-static {v0, v1, v2, p1}, LJ9/h;->a(FLT/z1;LT/z1;Lo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
