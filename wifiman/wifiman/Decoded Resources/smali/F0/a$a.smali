.class final LF0/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/a;->e(LJ0/n;LG1/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF0/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/a$a;

    invoke-direct {v0}, LF0/a$a;-><init>()V

    sput-object v0, LF0/a$a;->a:LF0/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/a$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
