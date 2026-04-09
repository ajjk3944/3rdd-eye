.class final LF/a0$b$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/a0$b;->a(LM/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF/a0$b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/a0$b$f;

    invoke-direct {v0}, LF/a0$b$f;-><init>()V

    sput-object v0, LF/a0$b$f;->a:LF/a0$b$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM/F;)LR0/i;
    .locals 4

    invoke-virtual {p1}, LM/b;->m()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, LR0/g;

    invoke-virtual {p1}, LM/b;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p1

    sub-int/2addr v0, p1

    const/4 p1, 0x0

    invoke-direct {v1, p1, v0}, LR0/g;-><init>(II)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM/F;

    invoke-virtual {p0, p1}, LF/a0$b$f;->a(LM/F;)LR0/i;

    move-result-object p1

    return-object p1
.end method
