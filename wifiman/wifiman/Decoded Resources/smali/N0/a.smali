.class public final LN0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN0/a;

    invoke-direct {v0}, LN0/a;-><init>()V

    sput-object v0, LN0/a;->a:LN0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LN0/f;)Landroid/text/SegmentFinder;
    .locals 1

    new-instance v0, LN0/a$a;

    invoke-direct {v0, p1}, LN0/a$a;-><init>(LN0/f;)V

    invoke-static {v0}, LM0/c;->a(Ljava/lang/Object;)Landroid/text/SegmentFinder;

    move-result-object p1

    return-object p1
.end method
