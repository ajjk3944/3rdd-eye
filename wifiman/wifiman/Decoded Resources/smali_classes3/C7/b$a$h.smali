.class public abstract LC7/b$a$h;
.super LC7/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC7/b$a$h$a;,
        LC7/b$a$h$b;
    }
.end annotation


# instance fields
.field private final a:Lmh/l;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LC7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    sget-object v0, LC7/b$a$h$c;->a:LC7/b$a$h$c;

    iput-object v0, p0, LC7/b$a$h;->a:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LC7/b$a$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lmh/l;
    .locals 1

    iget-object v0, p0, LC7/b$a$h;->a:Lmh/l;

    return-object v0
.end method
