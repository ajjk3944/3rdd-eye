.class public final Lcom/ui/btle/v2/a$a$b$a;
.super Lcom/ui/btle/v2/a$a$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/btle/v2/a$a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/btle/v2/a$a$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/v2/a$a$b$a;

    invoke-direct {v0}, Lcom/ui/btle/v2/a$a$b$a;-><init>()V

    sput-object v0, Lcom/ui/btle/v2/a$a$b$a;->a:Lcom/ui/btle/v2/a$a$b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/btle/v2/a$a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
