.class public final LQ9/j$a$a;
.super LQ9/j$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ9/j$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LQ9/j$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ9/j$a$a;

    invoke-direct {v0}, LQ9/j$a$a;-><init>()V

    sput-object v0, LQ9/j$a$a;->a:LQ9/j$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LQ9/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
