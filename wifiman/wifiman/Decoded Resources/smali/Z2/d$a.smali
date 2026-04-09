.class public final LZ2/d$a;
.super LZ2/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LZ2/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ2/d$a;

    invoke-direct {v0}, LZ2/d$a;-><init>()V

    sput-object v0, LZ2/d$a;->a:LZ2/d$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LZ2/d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
