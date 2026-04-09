.class public final LXi/n$a;
.super LXi/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LXi/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/n$a;

    invoke-direct {v0}, LXi/n$a;-><init>()V

    sput-object v0, LXi/n$a;->a:LXi/n$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/n;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
