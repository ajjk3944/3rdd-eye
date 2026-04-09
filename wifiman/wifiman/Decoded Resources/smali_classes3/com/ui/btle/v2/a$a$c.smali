.class public final Lcom/ui/btle/v2/a$a$c;
.super Lcom/ui/btle/v2/a$a;
.source "SourceFile"

# interfaces
.implements LT8/b$d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/btle/v2/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lcom/ui/btle/v2/a$a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/v2/a$a$c;

    invoke-direct {v0}, Lcom/ui/btle/v2/a$a$c;-><init>()V

    sput-object v0, Lcom/ui/btle/v2/a$a$c;->a:Lcom/ui/btle/v2/a$a$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/btle/v2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
