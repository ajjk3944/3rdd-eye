.class final Lhd/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd/c;-><init>(Lje/u;LBc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lhd/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhd/c$e;

    invoke-direct {v0}, Lhd/c$e;-><init>()V

    sput-object v0, Lhd/c$e;->a:Lhd/c$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lje/r;

    check-cast p2, Lje/r;

    invoke-virtual {p0, p1, p2}, Lhd/c$e;->b(Lje/r;Lje/r;)Z

    move-result p1

    return p1
.end method

.method public final b(Lje/r;Lje/r;)Z
    .locals 1

    const-string v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lje/r$b$a;

    if-eqz v0, :cond_0

    instance-of v0, p2, Lje/r$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lje/r$b$a;

    invoke-virtual {p1}, Lje/r$b$a;->h()LS8/l;

    move-result-object p1

    check-cast p2, Lje/r$b$a;

    invoke-virtual {p2}, Lje/r$b$a;->h()LS8/l;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method
