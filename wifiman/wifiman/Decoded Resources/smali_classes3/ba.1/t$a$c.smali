.class public final Lba/t$a$c;
.super Lba/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba/t$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lba/t$a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lba/t$a$c;

    invoke-direct {v0}, Lba/t$a$c;-><init>()V

    sput-object v0, Lba/t$a$c;->a:Lba/t$a$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lba/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
