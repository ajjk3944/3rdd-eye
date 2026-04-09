.class public final LZ2/c$b;
.super LZ2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LZ2/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ2/c$b;

    invoke-direct {v0}, LZ2/c$b;-><init>()V

    sput-object v0, LZ2/c$b;->a:LZ2/c$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LZ2/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
