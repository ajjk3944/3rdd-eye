.class final LTd/d$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTd/d;->f()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTd/d$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTd/d$l;

    invoke-direct {v0}, LTd/d$l;-><init>()V

    sput-object v0, LTd/d$l;->a:LTd/d$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LVd/c;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LVd/c;->d()LVd/c$b;

    move-result-object p1

    sget-object v0, LVd/c$b;->FINISHED:LVd/c$b;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LVd/c;

    invoke-virtual {p0, p1}, LTd/d$l;->a(LVd/c;)Z

    move-result p1

    return p1
.end method
