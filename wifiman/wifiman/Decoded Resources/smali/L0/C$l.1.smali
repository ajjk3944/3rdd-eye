.class final LL0/C$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LL0/C$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$l;

    invoke-direct {v0}, LL0/C$l;-><init>()V

    sput-object v0, LL0/C$l;->a:LL0/C$l;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lm0/v0;
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->e()J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    goto :goto_1

    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lm0/x0;->b(I)J

    move-result-wide v0

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LL0/C$l;->a(Ljava/lang/Object;)Lm0/v0;

    move-result-object p1

    return-object p1
.end method
