.class final Lc0/c$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc0/d;

.field final synthetic b:Lc0/k;

.field final synthetic c:Lc0/h;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/Object;

.field final synthetic f:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Lc0/d;Lc0/k;Lc0/h;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lc0/c$c;->a:Lc0/d;

    iput-object p2, p0, Lc0/c$c;->b:Lc0/k;

    iput-object p3, p0, Lc0/c$c;->c:Lc0/h;

    iput-object p4, p0, Lc0/c$c;->d:Ljava/lang/String;

    iput-object p5, p0, Lc0/c$c;->e:Ljava/lang/Object;

    iput-object p6, p0, Lc0/c$c;->f:[Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lc0/c$c;->a:Lc0/d;

    iget-object v1, p0, Lc0/c$c;->b:Lc0/k;

    iget-object v2, p0, Lc0/c$c;->c:Lc0/h;

    iget-object v3, p0, Lc0/c$c;->d:Ljava/lang/String;

    iget-object v4, p0, Lc0/c$c;->e:Ljava/lang/Object;

    iget-object v5, p0, Lc0/c$c;->f:[Ljava/lang/Object;

    invoke-virtual/range {v0 .. v5}, Lc0/d;->i(Lc0/k;Lc0/h;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc0/c$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
