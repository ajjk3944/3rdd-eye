.class final Ljj/f$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;


# direct methods
.method constructor <init>(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Ljj/f$a$a;->a:Lmh/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljj/f$a$a;->a:Lmh/p;

    invoke-static {p1}, Ly0/o;->g(Ly0/y;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ly0/y;->a()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/y;

    invoke-virtual {p0, p1}, Ljj/f$a$a;->a(Ly0/y;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
