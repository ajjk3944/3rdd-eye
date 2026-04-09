.class final Le9/d$e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d$e;->b(Le9/c$a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/d;

.field final synthetic b:Le9/c$a;


# direct methods
.method constructor <init>(Le9/d;Le9/c$a;)V
    .locals 0

    iput-object p1, p0, Le9/d$e$b;->a:Le9/d;

    iput-object p2, p0, Le9/d$e$b;->b:Le9/c$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    new-instance v0, Le9/d$e$b$a;

    iget-object v1, p0, Le9/d$e$b;->a:Le9/d;

    iget-object v2, p0, Le9/d$e$b;->b:Le9/c$a;

    invoke-direct {v0, v1, v2, p1, p2}, Le9/d$e$b$a;-><init>(Le9/d;Le9/c$a;J)V

    invoke-static {v0}, Lf9/a;->b(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Le9/d$e$b;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
