.class final LF/a0$b$c;
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
.field public static final a:LF/a0$b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/a0$b$c;

    invoke-direct {v0}, LF/a0$b$c;-><init>()V

    sput-object v0, LF/a0$b$c;->a:LF/a0$b$c;

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
    .locals 3

    new-instance v0, LR0/g;

    invoke-virtual {p1}, LM/b;->u()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-virtual {p1}, LM/b;->q()I

    move-result p1

    sub-int/2addr v1, p1

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1}, LR0/g;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM/F;

    invoke-virtual {p0, p1}, LF/a0$b$c;->a(LM/F;)LR0/i;

    move-result-object p1

    return-object p1
.end method
