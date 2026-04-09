.class public final LY5/c$a$a;
.super LY5/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY5/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LY5/c$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY5/c$a$a;

    invoke-direct {v0}, LY5/c$a$a;-><init>()V

    sput-object v0, LY5/c$a$a;->a:LY5/c$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LY5/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
