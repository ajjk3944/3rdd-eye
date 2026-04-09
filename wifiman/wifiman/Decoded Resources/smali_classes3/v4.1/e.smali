.class public final Lv4/e;
.super Lo4/g;
.source "SourceFile"


# instance fields
.field private final a:Lv4/o;


# direct methods
.method public constructor <init>(Lv4/o;Lo4/y;)V
    .locals 0

    invoke-direct {p0}, Lo4/g;-><init>()V

    invoke-static {p1, p2}, Lv4/e;->a(Lv4/o;Lo4/y;)V

    iput-object p1, p0, Lv4/e;->a:Lv4/o;

    return-void
.end method

.method private static a(Lv4/o;Lo4/y;)V
    .locals 1

    sget-object v0, Lv4/e$a;->b:[I

    invoke-virtual {p0}, Lv4/o;->d()LA4/y$c;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lo4/y;->b(Lo4/y;)Lo4/y;

    :goto_0
    return-void
.end method
