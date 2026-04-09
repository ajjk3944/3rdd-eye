.class final Lz8/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lz8/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz8/c$b;

    invoke-direct {v0}, Lz8/c$b;-><init>()V

    sput-object v0, Lz8/c$b;->a:Lz8/c$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/c;)LDj/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lre/c;->c()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lre/c;

    invoke-virtual {p0, p1}, Lz8/c$b;->a(Lre/c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
