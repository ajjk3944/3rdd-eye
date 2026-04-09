.class public final Lba/l$a$b;
.super Lba/l$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba/l$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lba/l$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lba/l$a$b;

    invoke-direct {v0}, Lba/l$a$b;-><init>()V

    sput-object v0, Lba/l$a$b;->a:Lba/l$a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lba/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
