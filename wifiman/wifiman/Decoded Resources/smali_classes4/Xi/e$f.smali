.class public final LXi/e$f;
.super LXi/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final a:LXi/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/e$f;

    invoke-direct {v0}, LXi/e$f;-><init>()V

    sput-object v0, LXi/e$f;->a:LXi/e$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
