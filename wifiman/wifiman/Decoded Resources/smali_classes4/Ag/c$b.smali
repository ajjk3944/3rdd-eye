.class final LAg/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAg/c;->b(Lgg/i;Lgg/i;Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LAg/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAg/c$b;

    invoke-direct {v0}, LAg/c$b;-><init>()V

    sput-object v0, LAg/c$b;->a:LAg/c$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LAg/c$b;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LYg/y;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LYg/y;
    .locals 1

    new-instance v0, LYg/y;

    invoke-direct {v0, p1, p2, p3}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
