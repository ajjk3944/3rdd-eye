.class public abstract LC0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC0/a$a;
    }
.end annotation


# static fields
.field public static final b:LC0/a$a;


# instance fields
.field private final a:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LC0/a;->b:LC0/a$a;

    return-void
.end method

.method private constructor <init>(Lmh/p;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LC0/a;->a:Lmh/p;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LC0/a;-><init>(Lmh/p;)V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    iget-object v0, p0, LC0/a;->a:Lmh/p;

    return-object v0
.end method
