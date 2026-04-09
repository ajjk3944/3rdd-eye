.class public final LU/d$j;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# static fields
.field public static final c:LU/d$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$j;

    invoke-direct {v0}, LU/d$j;-><init>()V

    sput-object v0, LU/d$j;->c:LU/d$j;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 0

    invoke-virtual {p3}, LT/e1;->T()I

    return-void
.end method
