.class public abstract Ldi/l;
.super Ldi/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/l$a;,
        Ldi/l$b;
    }
.end annotation


# static fields
.field public static final b:Ldi/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldi/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldi/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldi/l;->b:Ldi/l$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-direct {p0, v0}, Ldi/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldi/l;->c()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public c()LYg/J;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
