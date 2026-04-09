.class public final LV8/k$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT8/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;->K(LG6/N;)LT8/b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field private final b:Lgg/z;


# direct methods
.method constructor <init>(LG6/N;LV8/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, LG6/N;->a()I

    move-result v0

    iput v0, p0, LV8/k$q;->a:I

    invoke-interface {p1}, LG6/N;->g()Lgg/z;

    move-result-object p1

    sget-object v0, LV8/k$q$a;->a:LV8/k$q$a;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, LV8/k$q$b;->a:LV8/k$q$b;

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v0, LV8/k$q$c;->a:LV8/k$q$c;

    invoke-virtual {p1, v0}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {p2}, LV8/k;->u(LV8/k;)Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "readRssi()\n             \u2026beOn(schedulerProcessing)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LV8/k$q;->b:Lgg/z;

    return-void
.end method
