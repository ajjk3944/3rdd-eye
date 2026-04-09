.class final Ls7/c$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/c;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls7/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls7/c$c;

    invoke-direct {v0}, Ls7/c$c;-><init>()V

    sput-object v0, Ls7/c$c;->a:Ls7/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls7/f;)Ljava/lang/CharSequence;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls7/f;

    invoke-virtual {p0, p1}, Ls7/c$c;->a(Ls7/f;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
