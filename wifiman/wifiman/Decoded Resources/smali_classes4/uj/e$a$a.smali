.class public final Luj/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luj/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Luj/e$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj/e$a$a;

    invoke-direct {v0}, Luj/e$a$a;-><init>()V

    sput-object v0, Luj/e$a$a;->a:Luj/e$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmh/l;)Luj/e$a;
    .locals 1

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luj/e$a$a$a;

    invoke-direct {v0, p1}, Luj/e$a$a$a;-><init>(Lmh/l;)V

    return-object v0
.end method
