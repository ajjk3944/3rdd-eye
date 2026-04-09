.class public final LC7/b$a$b$b;
.super LC7/b$a$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:LC7/b$a$b$b;

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/b$a$b$b;

    invoke-direct {v0}, LC7/b$a$b$b;-><init>()V

    sput-object v0, LC7/b$a$b$b;->b:LC7/b$a$b$b;

    const/16 v0, 0x17

    sput v0, LC7/b$a$b$b;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LC7/b$a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    sget v0, LC7/b$a$b$b;->c:I

    return v0
.end method
