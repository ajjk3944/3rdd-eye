.class public final Leb/i$a$b;
.super Leb/i$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Leb/i$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/i$a$b;

    invoke-direct {v0}, Leb/i$a$b;-><init>()V

    sput-object v0, Leb/i$a$b;->a:Leb/i$a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Leb/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
