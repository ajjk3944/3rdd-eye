.class public final synthetic LA9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lmh/q;

.field public final synthetic b:Lmh/p;


# direct methods
.method public synthetic constructor <init>(Lmh/q;Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA9/d;->a:Lmh/q;

    iput-object p2, p0, LA9/d;->b:Lmh/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LA9/d;->a:Lmh/q;

    iget-object v1, p0, LA9/d;->b:Lmh/p;

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-static {v0, v1, p1, p2}, LA9/h;->a(Lmh/q;Lmh/p;LC0/U;LY0/b;)LC0/D;

    move-result-object p1

    return-object p1
.end method
