.class public final LX9/p$a$a;
.super LX9/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX9/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LX9/p$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX9/p$a$a;

    invoke-direct {v0}, LX9/p$a$a;-><init>()V

    sput-object v0, LX9/p$a$a;->a:LX9/p$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LX9/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
