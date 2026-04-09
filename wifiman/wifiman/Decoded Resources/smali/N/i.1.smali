.class final LN/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lm0/U0;

.field private final b:Lm0/X0;

.field private final c:Lm0/U0;


# direct methods
.method public constructor <init>(Lm0/U0;Lm0/X0;Lm0/U0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LN/i;->a:Lm0/U0;

    .line 3
    iput-object p2, p0, LN/i;->b:Lm0/X0;

    .line 4
    iput-object p3, p0, LN/i;->c:Lm0/U0;

    return-void
.end method

.method public synthetic constructor <init>(Lm0/U0;Lm0/X0;Lm0/U0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    invoke-static {}, Lm0/X;->a()Lm0/X0;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object p3

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, LN/i;-><init>(Lm0/U0;Lm0/X0;Lm0/U0;)V

    return-void
.end method


# virtual methods
.method public final a()Lm0/U0;
    .locals 1

    iget-object v0, p0, LN/i;->a:Lm0/U0;

    return-object v0
.end method

.method public final b()Lm0/X0;
    .locals 1

    iget-object v0, p0, LN/i;->b:Lm0/X0;

    return-object v0
.end method

.method public final c()Lm0/U0;
    .locals 1

    iget-object v0, p0, LN/i;->c:Lm0/U0;

    return-object v0
.end method
