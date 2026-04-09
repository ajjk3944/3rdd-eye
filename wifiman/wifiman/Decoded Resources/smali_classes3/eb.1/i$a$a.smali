.class public final Leb/i$a$a;
.super Leb/i$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Leb/i$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/i$a$a;

    invoke-direct {v0}, Leb/i$a$a;-><init>()V

    sput-object v0, Leb/i$a$a;->a:Leb/i$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Leb/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
