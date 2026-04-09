.class public final LH/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic b:LH/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/b$a;

    invoke-direct {v0}, LH/b$a;-><init>()V

    sput-object v0, LH/b$a;->b:LH/b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LH/f;)V
    .locals 0

    return-void
.end method
